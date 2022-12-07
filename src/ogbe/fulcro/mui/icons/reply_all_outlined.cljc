(ns ogbe.fulcro.mui.icons.reply-all-outlined
  #?(:cljs (:require
            ["@mui/icons-material/ReplyAllOutlined" :default ReplyAllOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-reply-all-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ReplyAllOutlined)))