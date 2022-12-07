(ns ogbe.fulcro.mui.icons.style-rounded
  #?(:cljs (:require
            ["@mui/icons-material/StyleRounded" :default StyleRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-style-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory StyleRounded)))