(ns ogbe.fulcro.mui.icons.place
  #?(:cljs (:require
            ["@mui/icons-material/Place" :default Place]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-place
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Place)))