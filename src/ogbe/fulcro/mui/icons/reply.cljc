(ns ogbe.fulcro.mui.icons.reply
  #?(:cljs (:require
            ["@mui/icons-material/Reply" :default Reply]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-reply
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Reply)))