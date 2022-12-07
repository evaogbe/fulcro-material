(ns ogbe.fulcro.mui.icons.stream-rounded
  #?(:cljs (:require
            ["@mui/icons-material/StreamRounded" :default StreamRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-stream-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory StreamRounded)))