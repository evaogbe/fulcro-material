(ns ogbe.fulcro.mui.icons.single-bed
  #?(:cljs (:require
            ["@mui/icons-material/SingleBed" :default SingleBed]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-single-bed
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SingleBed)))