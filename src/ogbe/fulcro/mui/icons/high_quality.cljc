(ns ogbe.fulcro.mui.icons.high-quality
  #?(:cljs (:require
            ["@mui/icons-material/HighQuality" :default HighQuality]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-high-quality
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory HighQuality)))