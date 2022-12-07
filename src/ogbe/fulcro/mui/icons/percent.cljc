(ns ogbe.fulcro.mui.icons.percent
  #?(:cljs (:require
            ["@mui/icons-material/Percent" :default Percent]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-percent
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Percent)))