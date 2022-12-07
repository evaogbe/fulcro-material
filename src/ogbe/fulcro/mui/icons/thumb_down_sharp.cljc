(ns ogbe.fulcro.mui.icons.thumb-down-sharp
  #?(:cljs (:require
            ["@mui/icons-material/ThumbDownSharp" :default ThumbDownSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-thumb-down-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ThumbDownSharp)))