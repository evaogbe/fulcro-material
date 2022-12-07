(ns ogbe.fulcro.mui.icons.duo-rounded
  #?(:cljs (:require
            ["@mui/icons-material/DuoRounded" :default DuoRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-duo-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory DuoRounded)))