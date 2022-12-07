(ns ogbe.fulcro.mui.icons.subway
  #?(:cljs (:require
            ["@mui/icons-material/Subway" :default Subway]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-subway
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Subway)))