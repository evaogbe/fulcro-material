(ns ogbe.fulcro.mui.icons.hls
  #?(:cljs (:require
            ["@mui/icons-material/Hls" :default Hls]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-hls
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Hls)))