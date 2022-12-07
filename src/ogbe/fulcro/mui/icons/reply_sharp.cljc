(ns ogbe.fulcro.mui.icons.reply-sharp
  #?(:cljs (:require
            ["@mui/icons-material/ReplySharp" :default ReplySharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-reply-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ReplySharp)))