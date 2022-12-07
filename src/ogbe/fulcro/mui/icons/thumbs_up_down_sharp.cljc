(ns ogbe.fulcro.mui.icons.thumbs-up-down-sharp
  #?(:cljs (:require
            ["@mui/icons-material/ThumbsUpDownSharp" :default ThumbsUpDownSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-thumbs-up-down-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ThumbsUpDownSharp)))