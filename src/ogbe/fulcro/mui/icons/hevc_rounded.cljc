(ns ogbe.fulcro.mui.icons.hevc-rounded
  #?(:cljs (:require
            ["@mui/icons-material/HevcRounded" :default HevcRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-hevc-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory HevcRounded)))