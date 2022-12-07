(ns ogbe.fulcro.mui.icons.thumb-up-sharp
  #?(:cljs (:require
            ["@mui/icons-material/ThumbUpSharp" :default ThumbUpSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-thumb-up-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ThumbUpSharp)))