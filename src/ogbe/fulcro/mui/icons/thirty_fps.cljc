(ns ogbe.fulcro.mui.icons.thirty-fps
  #?(:cljs (:require
            ["@mui/icons-material/ThirtyFps" :default ThirtyFps]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-thirty-fps
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ThirtyFps)))