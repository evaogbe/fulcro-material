(ns ogbe.fulcro.mui.icons.masks-rounded
  #?(:cljs (:require
            ["@mui/icons-material/MasksRounded" :default MasksRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-masks-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory MasksRounded)))