(ns ogbe.fulcro.mui.icons.hls-rounded
  #?(:cljs (:require
            ["@mui/icons-material/HlsRounded" :default HlsRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-hls-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory HlsRounded)))