(ns ogbe.fulcro.mui.icons.pending-actions-two-tone
  #?(:cljs (:require
            ["@mui/icons-material/PendingActionsTwoTone" :default PendingActionsTwoTone]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-pending-actions-two-tone
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PendingActionsTwoTone)))