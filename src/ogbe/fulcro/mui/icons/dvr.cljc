(ns ogbe.fulcro.mui.icons.dvr
  #?(:cljs (:require
            ["@mui/icons-material/Dvr" :default Dvr]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-dvr
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Dvr)))