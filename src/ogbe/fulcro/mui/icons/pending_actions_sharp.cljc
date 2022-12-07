(ns ogbe.fulcro.mui.icons.pending-actions-sharp
  #?(:cljs (:require
            ["@mui/icons-material/PendingActionsSharp" :default PendingActionsSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-pending-actions-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PendingActionsSharp)))