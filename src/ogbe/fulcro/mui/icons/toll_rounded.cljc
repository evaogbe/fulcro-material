(ns ogbe.fulcro.mui.icons.toll-rounded
  #?(:cljs (:require
            ["@mui/icons-material/TollRounded" :default TollRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-toll-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory TollRounded)))