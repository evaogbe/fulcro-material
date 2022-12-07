(ns ogbe.fulcro.mui.icons.reply-outlined
  #?(:cljs (:require
            ["@mui/icons-material/ReplyOutlined" :default ReplyOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-reply-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ReplyOutlined)))