(ns ogbe.fulcro.mui.icons.fit-screen
  #?(:cljs (:require
            ["@mui/icons-material/FitScreen" :default FitScreen]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-fit-screen
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory FitScreen)))