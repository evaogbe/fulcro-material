(ns ogbe.fulcro.mui.icons.paid-sharp
  #?(:cljs (:require
            ["@mui/icons-material/PaidSharp" :default PaidSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-paid-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PaidSharp)))