(ns ogbe.fulcro.mui.icons.build-two-tone
  #?(:cljs (:require
            ["@mui/icons-material/BuildTwoTone" :default BuildTwoTone]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-build-two-tone
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory BuildTwoTone)))