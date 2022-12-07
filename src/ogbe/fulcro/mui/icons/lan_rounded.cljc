(ns ogbe.fulcro.mui.icons.lan-rounded
  #?(:cljs (:require
            ["@mui/icons-material/LanRounded" :default LanRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-lan-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory LanRounded)))