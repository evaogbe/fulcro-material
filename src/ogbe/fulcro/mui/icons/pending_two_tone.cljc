(ns ogbe.fulcro.mui.icons.pending-two-tone
  #?(:cljs (:require
            ["@mui/icons-material/PendingTwoTone" :default PendingTwoTone]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-pending-two-tone
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PendingTwoTone)))