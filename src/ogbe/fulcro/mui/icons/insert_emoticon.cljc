(ns ogbe.fulcro.mui.icons.insert-emoticon
  #?(:cljs (:require
            ["@mui/icons-material/InsertEmoticon" :default InsertEmoticon]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-insert-emoticon
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory InsertEmoticon)))