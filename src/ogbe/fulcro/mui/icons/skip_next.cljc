(ns ogbe.fulcro.mui.icons.skip-next
  #?(:cljs (:require
            ["@mui/icons-material/SkipNext" :default SkipNext]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-skip-next
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SkipNext)))