(ns ogbe.fulcro.mui.icons.reply-two-tone
  #?(:cljs (:require
            ["@mui/icons-material/ReplyTwoTone" :default ReplyTwoTone]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-reply-two-tone
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ReplyTwoTone)))