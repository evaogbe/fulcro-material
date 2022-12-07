(ns ogbe.fulcro.mui.icons.soap
  #?(:cljs (:require
            ["@mui/icons-material/Soap" :default Soap]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-soap
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Soap)))