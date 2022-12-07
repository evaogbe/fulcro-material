(ns ogbe.fulcro.mui.icons.markunread-mailbox
  #?(:cljs (:require
            ["@mui/icons-material/MarkunreadMailbox" :default MarkunreadMailbox]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-markunread-mailbox
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory MarkunreadMailbox)))