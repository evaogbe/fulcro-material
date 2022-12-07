(ns ogbe.fulcro.mui.icons.move-to-inbox
  #?(:cljs (:require
            ["@mui/icons-material/MoveToInbox" :default MoveToInbox]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-move-to-inbox
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory MoveToInbox)))