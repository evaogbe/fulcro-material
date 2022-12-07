(ns ogbe.fulcro.mui.icons.reply-all
  #?(:cljs (:require
            ["@mui/icons-material/ReplyAll" :default ReplyAll]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-reply-all
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ReplyAll)))