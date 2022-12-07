(ns ogbe.fulcro.mui.icons.reply-all-sharp
  #?(:cljs (:require
            ["@mui/icons-material/ReplyAllSharp" :default ReplyAllSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-reply-all-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ReplyAllSharp)))