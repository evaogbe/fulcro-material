(ns ogbe.fulcro.mui.icons.auto-stories
  #?(:cljs (:require
            ["@mui/icons-material/AutoStories" :default AutoStories]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-auto-stories
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory AutoStories)))