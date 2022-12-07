(ns ogbe.fulcro.mui.icons.start-rounded
  #?(:cljs (:require
            ["@mui/icons-material/StartRounded" :default StartRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-start-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory StartRounded)))