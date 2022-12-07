(ns ogbe.fulcro.mui.icons.male-rounded
  #?(:cljs (:require
            ["@mui/icons-material/MaleRounded" :default MaleRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-male-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory MaleRounded)))