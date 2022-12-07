(ns ogbe.fulcro.mui.icons.linear-scale
  #?(:cljs (:require
            ["@mui/icons-material/LinearScale" :default LinearScale]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-linear-scale
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory LinearScale)))