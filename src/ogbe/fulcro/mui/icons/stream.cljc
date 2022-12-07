(ns ogbe.fulcro.mui.icons.stream
  #?(:cljs (:require
            ["@mui/icons-material/Stream" :default Stream]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-stream
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Stream)))