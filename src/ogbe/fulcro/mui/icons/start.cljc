(ns ogbe.fulcro.mui.icons.start
  #?(:cljs (:require
            ["@mui/icons-material/Start" :default Start]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-start
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Start)))