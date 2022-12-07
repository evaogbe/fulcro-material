(ns ogbe.fulcro.mui.icons.tsunami
  #?(:cljs (:require
            ["@mui/icons-material/Tsunami" :default Tsunami]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-tsunami
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Tsunami)))