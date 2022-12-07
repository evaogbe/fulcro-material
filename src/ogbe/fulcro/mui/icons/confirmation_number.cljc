(ns ogbe.fulcro.mui.icons.confirmation-number
  #?(:cljs (:require
            ["@mui/icons-material/ConfirmationNumber" :default ConfirmationNumber]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-confirmation-number
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ConfirmationNumber)))