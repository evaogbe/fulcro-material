(ns ogbe.fulcro.mui.icons.mms
  #?(:cljs (:require
            ["@mui/icons-material/Mms" :default Mms]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-mms
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Mms)))