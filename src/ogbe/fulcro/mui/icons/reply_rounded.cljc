(ns ogbe.fulcro.mui.icons.reply-rounded
  #?(:cljs (:require
            ["@mui/icons-material/ReplyRounded" :default ReplyRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-reply-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ReplyRounded)))