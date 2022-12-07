(ns ogbe.fulcro.mui.icons.hls-sharp
  #?(:cljs (:require
            ["@mui/icons-material/HlsSharp" :default HlsSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-hls-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory HlsSharp)))