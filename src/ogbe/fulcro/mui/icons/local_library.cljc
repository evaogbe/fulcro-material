(ns ogbe.fulcro.mui.icons.local-library
  #?(:cljs (:require
            ["@mui/icons-material/LocalLibrary" :default LocalLibrary]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-local-library
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory LocalLibrary)))