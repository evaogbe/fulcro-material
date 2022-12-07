(ns ogbe.fulcro.mui.icons.textsms
  #?(:cljs (:require
            ["@mui/icons-material/Textsms" :default Textsms]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-textsms
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Textsms)))