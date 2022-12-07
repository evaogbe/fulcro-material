(ns ogbe.fulcro.mui.icons.mark-as-unread-sharp
  #?(:cljs (:require
            ["@mui/icons-material/MarkAsUnreadSharp" :default MarkAsUnreadSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-mark-as-unread-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory MarkAsUnreadSharp)))