(ns ogbe.fulcro.mui.icons.thumbs-up-down
  #?(:cljs (:require
            ["@mui/icons-material/ThumbsUpDown" :default ThumbsUpDown]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-thumbs-up-down
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ThumbsUpDown)))