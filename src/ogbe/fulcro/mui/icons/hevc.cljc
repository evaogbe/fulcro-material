(ns ogbe.fulcro.mui.icons.hevc
  #?(:cljs (:require
            ["@mui/icons-material/Hevc" :default Hevc]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-hevc
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Hevc)))