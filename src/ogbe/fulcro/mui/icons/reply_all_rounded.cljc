(ns ogbe.fulcro.mui.icons.reply-all-rounded
  #?(:cljs (:require
            ["@mui/icons-material/ReplyAllRounded" :default ReplyAllRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-reply-all-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ReplyAllRounded)))