(ns ogbe.fulcro.mui.icons.face
  #?(:cljs (:require
            ["@mui/icons-material/Face" :default Face]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-face
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Face)))